/*
 * url: https://vjudge.net/solution/59244928/7Q1SEtukMmVldOxJJZcw
 * date: 16 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;

void solution()
{
  int n{};
  cin >> n;

  vector<int> v;
  for (int i = 1; i <= n; i++)
  {
    int num{};
    cin >> num;

    if (num == 1)
      v.push_back(i);
  }

  cout << v.size() << "\n";
  v.push_back(n + 1);
  for (int i = 1; i < v.size(); i++)
  {
    cout << v[i] - v[i - 1] << " ";
  }
  cout << "\n";
}

int main()
{
  solution();

  return 0;
}