/*
 * url: https://vjudge.net/solution/58956292/rZZy6JBQMGmFJvXf1D63
 * date: 07 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;

int main()
{
  int n{};
  cin >> n;

  priority_queue<int> pt;
  int curr{};
  while (n--)
  {
    int a{}, b{};
    cin >> a >> b;

    curr += -a + b;
    pt.push(curr);
  }

  cout << pt.top() << "\n";

  return 0;
}