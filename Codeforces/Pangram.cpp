/*
 * url1: https://vjudge.net/solution/58845369/cvpfYKHZIyTln044odZS
 * url2: https://vjudge.net/solution/58845611/rAzTOjRJJ916U5q8BMOj
 * date: 03 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;

void solution_using_set()
{
  int n{};
  string str{};
  cin >> n >> str;

  set<char> st;
  for (int i = 0; i < str.length(); i++)
    st.insert(tolower(str[i]));

  cout << (st.size() == 26 ? "YES" : "NO") << "\n";
}

void solution_using_freq_array()
{
  int n{};
  string str{};
  cin >> n >> str;

  int freq[26]{};
  for (int i = 0; i < str.length(); i++)
  {
    char ch = tolower(str[i]);
    freq[ch - 'a']++;
  }

  for (int i = 0; i < 26; i++)
  {
    if (freq[i] == 0)
    {
      cout << "NO\n";
      return;
    }
  }

  cout << "YES\n";
}

int main()
{
  solution_using_set();

  return 0;
}