s1="def pr(s):$  print s$  s2=s1.replace(chr(36),chr(10))$  print s2$  print 'pr('+chr(34)+'s1='+chr(34)+'+chr(34)+s1+chr(34))'"
def pr(s):
  print s
  s2=s1.replace(chr(36),chr(10))
  print s2
  print 'pr('+chr(34)+'s1='+chr(34)+'+chr(34)+s1+chr(34))'
pr("s1="+chr(34)+s1+chr(34))
