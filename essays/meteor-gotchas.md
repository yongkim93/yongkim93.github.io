---
layout: essay
type: essay
title: "Meteor Gotchas"
date: 2017-10-19
labels:
  - Software Engineering
  - Meteor
---


  I have experiences in HTML/CSS and Javascript that I am more used to develop a web site in a plain text editor from scratch because that is how I learn web design in KCC. Meteor seems complicated to understand and it took me for while to understand how these directories are organized and connected. Most of the time, code that I wrote didn't even show up that I was trying to find typos that I might create. However, 99% time of the problem was I didn't import the code in somewhere else that is needed to be imported. I took a moment of the time and try to understand how these directed are connected and why Meteor organized this way. It didn't really take me long to understand how they are connected. The first thing that I noticed is every HTML file has their following javascript file. of course, it was very obvious fact but I forgot I have to import HTML an javascript file together where I'm importing to. 
  
  the second problem that I had faced was Meteor runs very slow in Window. It was the very frustrating experience that when I was doing class WOD, it took me 15 minutes to run Meteor and I barely finished right before it ends. When I was using Meteor at home, time wasn't a problem, so I just let it run for 20 minutes but after I saw Danny running the Meteor in less than 30 seconds, I realized my Window laptop is really slow. I searched google for quite long time and figured that anti-virus program, Windows Defender, was checking every single thing Meteor is downloading. It took most of my CPU and when I tried to use another program, it crashed. so I just disabled Window defender and ran meteor and it was much faster than before. if you having the same problem, you should disable windows defender and try how it goes. 
