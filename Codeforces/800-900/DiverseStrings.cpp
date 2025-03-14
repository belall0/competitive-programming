/*
 * url: https://vjudge.net/solution/58846489/J6HtI7n16l1Os4PpmzyK
 * date: 03 - 03 - 2025
 * category: strings
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;
void solution()
{
  int n{};

  cin >> n;
  while (n--)
  {
    string str{};
    cin >> str;
    sort(str.begin(), str.end());

    bool isDiverse{true};
    for (int i = 1; i < str.length(); i++)
    {
      if (str[i] - 1 != str[i - 1])
      {
        isDiverse = false;
        break;
      }
    }

    cout << (isDiverse ? "YES" : "NO") << "\n";
  }
}

int main()
{
  solution();

  return 0;
}