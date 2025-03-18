/*
 * url: https://vjudge.net/solution/59310146/JqnPaLK4PfY6cYByFnjn
 * date: 18 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;

int main()
{
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t, num, oper;
  queue<int> q;

  cin >> t;
  while (t--)
  {
    cin >> oper;
    if (oper == 1)
    {
      cin >> num;
      q.push(num);
    }
    else if (oper == 2 && !q.empty())
    {
      q.pop();
    }
    else if (oper == 3)
    {
      if (!q.empty())
        cout << q.front() << '\n';
      else
        cout << "Empty!\n";
    }
  }

  return 0;
}
