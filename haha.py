#I made this last November that I ran on a friend's computer that randomly opened a website every 9-18 seconds, was not amused 

import webbrowser
import time
import random

while True:
	sites = random.choice(['beesbeesbees.com', 'urbandictionary.com/define.php?term=goofed', 'en.wikipedia.org/wiki/Goofball'])
	visit = "http://{}".format(sites)
	webbrowser.open(visit)
	seconds = random.randrange(9 , 18)
	time.sleep(seconds)

