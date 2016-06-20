print("100 Doors")

for i in range(1,101):
	if i ** 0.5 % 1:
		state = 'open'
	else:
		state = 'closed'
	print("Door {} : {}" .format(i,state))