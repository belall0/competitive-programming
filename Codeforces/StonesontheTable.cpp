/*
 * url: https://vjudge.net/solution/58924344/NbZk7WnCyi0Miu3vgvlo
 * date: 06 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;

int main()
{
  int n{};
  cin >> n;
  string str{};
  cin >> str;

  int cnt{};
  for (int i = 1; i < str.length(); i++)
    if (str[i] == str[i - 1])
      cnt++;

  cout << cnt << "\n";
  return 0;
}