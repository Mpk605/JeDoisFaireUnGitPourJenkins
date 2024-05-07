import requests

result = requests.post("http://localhost:8080/formation/jpa/utilisateur",
                      json=
                      {
                          "nom": "Rob Zombie",
                          "age": 23,
                          "poste": "Consultant Power BI",
                          "competences": "MAVEN,HIBERNATE,AIA",
                          "note": "3,5",
                          "image": "assets/images/rob.png"
                      }
                      )

print(result.text)
