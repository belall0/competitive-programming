/*
 * url: https://vjudge.net/solution/59359372/kkPDnhbzOrEpa0JmEXCE
 * date: 19 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;

void solution()
{
  int n{};
  cin >> n;
  cin.ignore();

  while (n--)
  {
    string str{};
    getline(cin, str);

    bool is_correct{true};
    stack<char> stk;

    for (int i = 0; i < str.length(); i++)
    {
      if (str[i] == '(' || str[i] == '[')
        stk.push(str[i]);

      else
      {
        if (stk.empty())
        {
          is_correct = false;
          break;
        }

        if ((str[i] == ')' && stk.top() != '(') || (str[i] == ']' && stk.top() != '['))
        {
          is_correct = false;
          break;
        }

        stk.pop();
      }
    }

    cout << (is_correct && stk.size() == 0 ? "Yes" : "No") << "\n";
  }
}

int main()
{
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  solution();

  return 0;
}
