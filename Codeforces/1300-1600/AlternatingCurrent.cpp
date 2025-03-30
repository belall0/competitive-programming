/*
 * url: https://vjudge.net/solution/59359727/HmcdC9WDWA1fkLO2lNOx
 * date: 19 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;

void solution()
{
  string str{};
  cin >> str;

  stack<char> stk;
  for (char c : str)
  {
    if (stk.empty() || stk.top() != c)
      stk.push(c);
    else
      stk.pop();
  }

  cout << (stk.empty() ? "Yes\n" : "No\n") << "\n";
}

int main()
{
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  solution();

  return 0;
}
