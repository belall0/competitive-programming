/*
 * url: https://vjudge.net/solution/58906927/fhsvXf1MxqeuXmvncXfI
 * date: 05 - 03 - 2025
 * category: sorting
 * complexity: O(nlogn)
 * approach: the problem is to find the minimum number of compressions needed to make the sum of all a[i] <= m
 * we need to find the effect of each compression not the largest a or smallest b
 * so after calculating the effect of each compression we sort the effects in descending order so the first element will have the largest effect
 * and continue compressing until the sum of all a[i] <= m
 */

#include <bits/stdc++.h>
using namespace std;

bool compare(pair<int, int> &first, pair<int, int> &second)
{
  return first.first > second.first;
}

int main()
{
  int n{}, m{};
  cin >> n >> m;
  long long sum{};

  vector<int> a(n), b(n);
  vector<pair<int, int>> effect(n);

  for (int i = 0; i < n; i++)
  {
    cin >> a[i] >> b[i];
    sum += a[i];
    effect[i] = {a[i] - b[i], i};
  }

  if (sum <= m)
  {
    cout << 0 << "\n";
    return 0;
  }

  sort(effect.begin(), effect.end(), compare);

  bool is_valid{false};
  int min_compression{};
  for (int i = 0; i < n; i++)
  {
    int indx_of_largest_effect = effect[i].second;
    sum -= a[indx_of_largest_effect];
    sum += b[indx_of_largest_effect];

    if (sum <= m)
    {
      min_compression = i + 1;
      is_valid = true;
      break;
    }
  }

  cout << (is_valid ? min_compression : -1) << "\n";

  return 0;
}