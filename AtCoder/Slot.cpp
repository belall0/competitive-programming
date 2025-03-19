/*
 * url: https://vjudge.net/solution/59354483/adglMGxvUMtK9MN6j5N8
 * date: 19 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;

int main()
{
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  string str{};
  cin >> str;

  set<char> st;
  for (const char &i : str)
  {
    st.insert(i);
  }

  cout << (st.size() == 1 ? "Won" : "Lost") << "\n";

  return 0;
}
