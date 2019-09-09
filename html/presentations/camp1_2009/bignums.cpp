#include <cmath>
#include <utility>
#include <algorithm>
#include <numeric>
#include <cctype>


#define len 100
#define base 10000

using namespace std;

struct big_num
{
	int N[len+1];
	
	big_num()
	{ 	fill(N, N+len, 0); 	}

	
	big_num(int n)
	{
		fill(N, N+len, 0); 	
		N[0]=n;
		reduce();
	}

	int size()
	const {
		for (int k = len; k>0 ; --k)
		{
			if (N[k]!=0) 
				{return k;}
		}
		return 0;
	}

	void reduce()
	{
		for (int k = 0; k<len; ++k)
		{
			N[k+1] += N[k] / base;
			N[k] %= base; 
		}
	}

	// big_num + bignum
	big_num operator+(const big_num &b) 
	const {
	    	big_num ans;
		for (int k = 0; k<len; ++k)
      		{
			ans.N[k]= N[k] + b.N[k];
		}
		ans.reduce();
		return ans;
  	}

	// big_num + int
	
	big_num operator+(const int &b) 
	const {
	    	big_num ans = *this;
		ans.N[0] += b;
		ans.reduce();
		return ans;
  	}
	
	// big_num * int
	big_num operator*(const int &b)  // Might be  horribly wrong..
	const {
   		big_num ans = *this;
    		ans.N[0] *= b;
		ans.reduce();
    		return ans;
  	}

	// big_num * big_num	
	big_num operator*(const big_num &b) 
	const {
   		big_num ans;
    		for (int k = 0; k<len; ++k)
      			for (int l = 0; l<len-1; ++l)
        			ans.N[k + l] += N[k] * b.N[l];
    		ans.reduce();
    		return ans;
  	}

	// big_num < big_num
	bool operator<(const big_num &b) 
	const {
    		if (size() != b.size())
      			return size() < b.size();
    		return lexicographical_compare( N+0, N+len, b.N+0, b.N+len);
  	}
	
	void print() 
	const {
	    	bool flag = false;
	    	for (int i = len-1; i >= 0; i--) 
		{
	      		if (flag) {  printf("%04d", N[i]); } 
			else if (N[i]) 
			{
 	       		printf("%d", N[i]);
 	       		flag = true;
 	     		}
 	   	}
 	   	if (!flag) printf("0\n");
 	   	else printf("\n");
  	}
	// big_num ^ int
	big_num pow(int b)
	{
		big_num ans = *this;
		for (int k = 0;k<b; ++k)
		{
			ans= ans * *this;
			//ans.print();
		}

		return ans; 
	}

};


int main()
{
	//big_num a = big_num(2);
	//a.pow(100000).print();
	
	big_num a = big_num(21);
	(a * 5).print();

	
	return 0;
}


