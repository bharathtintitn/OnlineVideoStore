OnlineVideoStore
================

In this project we have mainly focused on implementing backend activity of video store. Assumption is that, we get request
from front end GUI.
Based on the request we recieve, we call functionality.
In this video store user can add new movie to database, change price and quantity of the movie added.
Also, get the details of movies like movie name, quantity of movie and price of the movie. 
Currently we not updating details to database, we are serialising the details using command and memento design pattern. 
Adding new functionality shouldn't be problem, since we have used decorator design pattern for implementing functionality.
Adding new disc to our video store we not have problem.

