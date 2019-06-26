#include <iostream>
#include <unordered_set>
#include <cassert>

bool isUnique(std::string &&str) {
    std::unordered_set<char> uset;
    for(auto c : str) {
        if (uset.find(c) == uset.end()) {
            uset.insert(c);
        } else {
            return false;
        }
    }
    return true;
}

int main() {

    assert(isUnique("hello") == false);
    assert(isUnique("abcdefg") == true);

    return 0;
}
