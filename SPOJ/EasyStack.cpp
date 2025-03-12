/*
 * url: https://vjudge.net/solution/59137780/Eu6HjiPJ2132VJuLI6Mg
 * date: 12 - 03 - 2025
 * category: data structures
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;

void solution()
{
  // fast input and output
  ios::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);

  int t{};
  cin >> t;

  stack<int> stk;
  while (t--)
  {
    int q{};
    cin >> q;

    if (q == 1)
    {
      int num{};
      cin >> num;
      stk.push(num);
    }
    else if (q == 2)
    {
      if (!stk.empty())
      {
        stk.pop();
      }
    }
    else
    {
      if (stk.empty())
      {
        cout << "Empty!\n";
      }
      else
      {
        cout << stk.top() << "\n";
      }
    }
  }
}

int main()
{

  solution();

  return 0;
}