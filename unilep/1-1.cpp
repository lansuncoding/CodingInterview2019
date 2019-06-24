// Arrays and Strings problem 1.1

#include <iostream>
using namespace std;

bool isUniqueChars(string s)
{
  long bits = 0l;
  for (char c : s)
  {
    long bit = 1 << (c - 'A');
    if (bits & bit)
    {
      return false;
    }
    bits |= bit;
  }
  return true;
}

int main()
{
  cout << isUniqueChars("abcde") << endl;
  cout << isUniqueChars("aa") << endl;
  cout << isUniqueChars("abcdea") << endl;
  cout << isUniqueChars("bmaipz") << endl;
  cout << isUniqueChars("bmaipb") << endl;
  return 0;
}