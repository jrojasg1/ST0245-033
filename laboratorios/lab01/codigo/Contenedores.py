
def ways(n):
  if n<= 2:
    return n
  return ways(n-1) + ways(n-2);

ways(4)


""" complejidad: T(n)= c+c+2T(n-1) """
