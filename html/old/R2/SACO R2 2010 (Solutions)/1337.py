#!/usr/bin/env python
# Keegan Carruthers-Smith - 133t - SACO R2 2010

msg = raw_input('Enter message: ')
srcs = '31098'
dsts = 'ELOGB'
for src, dst in zip(srcs, dsts):
    msg = msg.replace(src, dst)
print msg
