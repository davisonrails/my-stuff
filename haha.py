import webbrowser
import time
import random

while True:
	sites = random.choice(['cornhub.com', 'beesbeesbees.com', 'urbandictionary.com/define.php?term=goofed', 'en.wikipedia.org/wiki/Goofball'])
	visit = "http://{}".format(sites)
	webbrowser.open(visit)
	seconds = random.randrange(9 , 18)
	time.sleep(seconds)

