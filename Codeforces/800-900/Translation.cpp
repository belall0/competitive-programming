/*
 * url: https://vjudge.net/solution/58762286/TbZ7X4ijzqRwjCS1gvkn
 * date: 28 - 02 - 2025
 * category: Implementation
 * complexity: O(n)
 * appproach: just compare the string from the end
 */

#include <iostream>
#include <string>
using namespace std;

int main()
{
  string s{}, t{};
  cin >> s >> t;

  if (s.length() != t.length())
  {
    cout << "NO\n";
    return 0;
  }

  bool isTrue = true;
  for (int i = 0; i < s.length(); i++)
  {
    int t_index = t.length() - 1 - i;
    if (s[i] != t[t_index])
    {
      isTrue = false;
      break;
    }
  }

  if (isTrue)
  {
    cout << "YES\n";
  }
  else
  {
    cout << "NO\n";
  }

  return 0;
}