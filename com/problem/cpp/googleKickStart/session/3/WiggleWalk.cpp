#include <iostream>
#include <vector>
#include <queue>
#include <map>
#include <string>
#include <set>
using namespace std;
inline long long trans(int r, int c) {
	return r * 51000 + c;
}
void findDir(map<int, set<int>>& ver, map<int, set<int>>& hor, map<long long, short>& m, int r, int c, char d, int& ansR, int& ansC) {
	if (d == 'E') {
		for (auto i = hor[r].begin(); i != hor[r].end(); i++) {
			if (*i > ansC) {
				ansC = *i;
				break;
			}
		}
		ansR = r;
	}
	if (d == 'N') {
		int before = 0;
		for (auto i = ver[c].begin(); i != ver[c].end(); i++) {

			if (before < ansR && (*(i) > ansR)) {
				ansR = before;
				break;
			}
			before = *i;
		}
		ansC = c;
	}
	if (d == 'S') {
		for (auto i = ver[c].begin(); i != ver[c].end(); i++) {
			if (*i > ansR) {
				ansR = *i;
				break;
			}
		}
		ansC = c;
	}
	if (d == 'W') {
		int before = 0;
		for (auto i = hor[r].begin(); i != hor[r].end(); i++) {
			if (before < ansC && (*(i) > ansC)) {
				ansC = before;
				break;
			}
			before = *i;
		}
		ansR = r;
	}
	if (m[trans(ansR - 1, ansC)] == 0) {
		ver[ansC].insert(ansR - 1);
	}
	else {
		ver[ansC].erase(ansR - 1);

	}
	if (m[trans(ansR + 1, ansC)] == 0) {
		ver[ansC].insert(ansR + 1);
	}
	else {
		ver[ansC].erase(ansR + 1);

	}
	if (m[trans(ansR, ansC - 1)] == 0) {
		hor[ansR].insert(ansC - 1);
	}
	else {
		hor[ansR].erase(ansC - 1);

	}
	if (m[trans(ansR, ansC + 1)] == 0) {
		hor[ansR].insert(ansC + 1);
	}
	else {
		hor[ansR].erase(ansC + 1);

	}
	hor[ansR].erase(ansC);
	ver[ansC].erase(ansR);
//	cout << ansR << " " << ansC << endl;


}
int main()
{
	int numTest, row, column;
	cin >> numTest;
	for (int l = 0; l < numTest; l++) {
		map<int, set<int>> neighborVer;
		map<int, set<int>> neighborHor;
		map<long long, short> m;
		string opS;
		int numOp;
		int r, c;
		int sr, sc;
		cin >> numOp >> r >> c >> sr >> sc;
		cin >> opS;
		m[trans(sr, sc)] = 1;
		neighborHor[sr].insert(sc - 1);
		neighborHor[sr].insert(sc + 1);
		neighborVer[sc].insert(sr - 1);
		neighborVer[sc].insert(sr + 1);

		for (int i = 0; i < numOp; i++) {
			char d = opS[i];
			int ansR = sr, ansC = sc;
			findDir(neighborVer, neighborHor, m, sr, sc, d, ansR, ansC);
			sr = ansR;
			sc = ansC;
			m[trans(sr, sc)] = 1;
		}
		cout << "Case #" << l + 1 << ": " << sr << " " << sc << endl;

	}
	return 0;
}


