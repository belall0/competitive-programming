
/*
 * url: https://vjudge.net/solution/59205961/VtnvLplsFhHXQeWvjpEM
 * date: 15 - 03 - 2025
 * category: implementation & data structures
 * complexity: O(n log(n))
 *
 * appproach: by reading the problem statement, i figured out that the collision will happen only when two particles are moving as following, x(i) < x(i+1), x(i) direction is R and x(i+1) direction is L.
 * so we can abstract the problem to the following, we need to find all pairs of RL, then minimize the time between them.
 * to calculate the time, we need to calculate the distance between the two particles, then divide it by 2.
 */

#include <bits/stdc++.h>
using namespace std;

void solution()
{
  int n{};
  cin >> n;

  string directions{};
  cin >> directions;

  vector<int> coordinates(n);
  for (int &i : coordinates)
    cin >> i;

  set<int> res;
  stack<int> prevCoordinate;
  for (int i = 0; i < n; i++)
  {
    if (directions[i] == 'R')
    {
      prevCoordinate.push(coordinates[i]);
    }
    else if (!prevCoordinate.empty() && directions[i] == 'L')
    {
      const int distance = coordinates[i] - prevCoordinate.top();
      const int time = distance / 2;

      res.insert(time);

      prevCoordinate.pop();
    }
  }

  cout << (res.size() == 0 ? -1 : *res.begin()) << "\n";
}

int main()
{

  solution();

  return 0;
}