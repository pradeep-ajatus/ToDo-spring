# ToDo-spring


This is a simple Todo App built on Springboot framework.


**FindAll Todos**

URL: localhost:8080
Response:
[
    {
        "id": 3,
        "category": "done",
        "name": "Sulagan",
        "complete": false
    },
    {
        "id": 7,
        "category": "Done",
        "name": "Pradeep Gupta",
        "complete": false
    },
    {
        "id": 27,
        "category": "Done",
        "name": "PradeepGupta",
        "complete": false
    },
    {
        "id": 28,
        "category": "Done",
        "name": "PradeepGupta",
        "complete": false
    },
    {
        "id": 29,
        "category": "Done",
        "name": "PradeepGupta",
        "complete": false
    },
    {
        "id": 30,
        "category": "Done",
        "name": "PradeepGupta",
        "complete": false
    },
    {
        "id": 31,
        "category": "Done",
        "name": "PradeepGupta",
        "complete": false
    },
    {
        "id": 32,
        "category": "Done",
        "name": "PradeepGupta",
        "complete": false
    },
    {
        "id": 33,
        "category": "Done",
        "name": "PradeepGupta",
        "complete": false
    },
    {
        "id": 34,
        "category": "Done",
        "name": "PradeepGupta",
        "complete": false
    }
]


**Add Todo**

URL: http://localhost:8080/add
Request:
  {
	"category":"Done",
	"name":"PradeepGupta"
  }
Response:
  {
    "id": 34,
    "category": "Done",
    "name": "PradeepGupta",
    "complete": false
  }


**Delete Todo**
URL: http://localhost:8080/delete?id=20
Response:
  false
  
  **Update Todo**
URL: http://localhost:8080/update
Request:
  {
	"category":"Done",
	"name":"Pradeep Gupta",
	"id":7,
	"complete":0
  }
Response:
  {
    "id": 7,
    "category": "Done",
    "name": "Pradeep Gupta",
    "complete": false
  }
