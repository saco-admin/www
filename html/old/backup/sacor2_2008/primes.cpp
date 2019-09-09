// SACO 2nd Round 2008
// Primes Paths Solution by Julian Kenwood

#include <algorithm>
#include <iostream>
#include <vector>
#include <queue>

#define INF 100000

using namespace std;

vector<int> primes;
vector<vector<int> > edges;
vector<int> dist;

int hdistance(int a, int b)
{
    int ans = 0;
    
    while(a != 0)
    {
        if(a % 10 != b % 10)
            ++ans;
        
        a/=10;
        b/=10;
    }
    
    return ans;
}

void calcPrimes(int startNum, int endNum)
{
    bool* sieve = new bool[endNum];
    
    fill(sieve, sieve+endNum, false);
    
    sieve[0] = true;
    sieve[1] = true;
  
    for(int i = 2; i*i < endNum; ++i)
    {
        if(!sieve[i])
        {
            for(int j = i*i; j < endNum; j+=i)
            {
                sieve[j] = true;
            }
        }
    }
    
    for(int i = startNum; i < endNum; ++i)
    {
        if(!sieve[i])
        {
            primes.push_back(i);
            dist.push_back(INF);
            edges.push_back(vector<int>());
        }
    }
  
    delete [] sieve;
   
    for(int i = 0; i < primes.size(); ++i)
    {
        for(int j = 0; j < primes.size(); ++j)
        {
            if(hdistance(primes[i], primes[j]) == 1)
            {
                edges[i].push_back(j);
            }
        }
    }
}

void bfs(int s)
{
    dist[s] = 0;
    
    queue<int> Q;
    Q.push(s);
    
    while(!Q.empty())
    {
         int tn = Q.front();
         Q.pop();
        
        int tDist = dist[tn];
        
        for(int i = 0; i < edges[tn].size(); ++i)
        {
            if(tDist+1 < dist[edges[tn][i]])
            {
                dist[edges[tn][i]] = tDist+1;
                
                Q.push(edges[tn][i]);
            }
        }
    }
}

int main()
{
    int sPrime, ePrime, sLoc, eLoc;
    
    cout << "What number did Hannah start with? ";
    cin >> sPrime;
    
    cout << "What number does she want to end with? ";
    cin >> ePrime;
    
    int lowPow = 1;
    int highPow = 10;
    
    while(lowPow*10 < sPrime)
    {
        lowPow *= 10;
        highPow *= 10;
    }
    
    calcPrimes(lowPow, highPow);
    
    for(int i = 0; i < primes.size(); ++i)
    {
        //cout << primes[i] << endl;
        
        if(primes[i] == sPrime)
            sLoc = i;
        
        if(primes[i] == ePrime)
            eLoc = i;
    }
    
    bfs(eLoc);
    
    int cNode = sLoc;
    
    vector<int> path;
    
    path.push_back(primes[cNode]);
    
    while(cNode != eLoc)
    {
        for(int i = 0; i < edges[cNode].size(); ++i)
        {
            if(dist[edges[cNode][i]]+1 == dist[cNode])
            {
                cNode = edges[cNode][i]; 
                path.push_back(primes[cNode]);
                break;
            }
        }
     }
    
    for(int i = 0; i < path.size(); ++i)
    {
        cout << path[i] << endl;
    }
}
