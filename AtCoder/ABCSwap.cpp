/*
 * url: https://vjudge.net/solution/58988166/cFJRv68QvLMlJgZsrUhE
 * date: 08 - 03 - 2025
 * category: implementation
 * complexity: O(1)
 */

#include <bits/stdc++.h>
using namespace std;

int main()
{
  int a{}, b{}, c{};
  cin >> a >> b >> c;

  swap(a, b);
  swap(a, c);

  cout << a << " " << b << " " << c << "\n";

  return 0;
}