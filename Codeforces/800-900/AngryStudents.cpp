/*
 * url: https://vjudge.net/solution/59282784/oZNVcrz44m78PaQ6WB79
 * date: 17 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;

void solution()
{
  int t{};
  cin >> t;

  while (t--)
  {
    int n{};
    cin >> n;

    string str{};
    cin >> str;

    vector<int> v;
    for (int i = 0; i < str.size(); i++)
    {

      if (str[i] == 'A')
        v.push_back(i + 1);
    }

    v.push_back(n + 1);

    set<int, greater<int>> st;
    for (int i = 1; i < v.size(); i++)
    {
      int diff{v[i] - v[i - 1] - 1};
      st.insert(diff);
    }

    cout << *st.begin() << "\n";
  }
}

int main()
{
  solution();

  return 0;
}