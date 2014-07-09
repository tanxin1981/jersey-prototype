jersey-prototype
================

Jersey on Grizzly with Hibernate

Benchmark
ab -n 10000 -c 70 <url>


Simple string:

Total transferred:      1270000 bytes
HTML transferred:       70000 bytes
Requests per second:    19247.43 [#/sec] (mean)
Time per request:       3.637 [ms] (mean)
Time per request:       0.052 [ms] (mean, across all concurrent requests)
Transfer rate:          2387.13 [Kbytes/sec] received


DB primary key look up with 1 join:

Total transferred:      830000 bytes
HTML transferred:       0 bytes
Requests per second:    6531.65 [#/sec] (mean)
Time per request:       10.717 [ms] (mean)
Time per request:       0.153 [ms] (mean, across all concurrent requests)
Transfer rate:          529.42 [Kbytes/sec] received


