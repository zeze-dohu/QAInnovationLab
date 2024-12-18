
  Feature: PetStore API

    Scenario Outline: PetStore
      Given la url es "https://petstore.swagger.io/v2"
      When consulto la mascota con ID "1"
      Then valido el codigo de respuesta sea 200
      Examples:



