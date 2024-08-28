"""750000 seconds is how many days, hours, minutes and seconds? Write a converter program."""

seconds = int(input("Enter the Total Seconds : "))
days =  seconds//(24*60*60)
seconds = seconds - days*24*60*60
hours = seconds // (60*60)
seconds = seconds - hours*60*60
minutes = seconds // 60 
seconds = seconds - minutes*60
print(f" Days : {days} \n Hours : {hours} \n Minutes : {minutes} \n Seconds : {seconds}")