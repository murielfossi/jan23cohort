


In Spring MVC, whenever you import Model into your controller you can use it as a container to store data and pass that data to the view engine. Data can be any type: objects, strings, numbers, even dates! And you can use it in any of your method signatures. When the framework gets a request mapped to that function, it will automatically create that Model instance container, the model variable in our code below. This is an example of dependency injection.

Think of it like an empty cup that gets created, filled up with little boxes of data, that then get poured into the template as it's being rendered.





https://hackmd.io/VzARqjb1TzadDcPGhJAesAhttps://hackmd.io/VzARqjb1TzadDcPGhJAesA
https://codepen.io/WolfsVeteran/pen/wvjxbJb for (frontend project)

to generate my constructor on spring tolls , in my model right click on the class, go to source and click on generate constructor using field
to generate my getter and setter , in my model, right click on the class  name, go to source and click on generate getters and setters

This go to the index.jsp file in bootstrap

<c:forEach var="person" items="${people}">
    <c:out value="${person.name}"/>
</c:forEach>



@NotNull, @NotEmpty, and @NotBlank are all annotations used in Java to apply constraints on method parameters, fields, and return values. They are used to ensure that certain values meet certain requirements and to catch potential errors at compile time. Here's a brief overview of each of them:

@NotNull: This annotation is used to indicate that a parameter, field, or method return value cannot be null. If null is passed in as an argument or returned from a method, an exception will be thrown at runtime. @NotNull is part of the Bean Validation framework, which is widely used in Java applications.

@NotEmpty: This annotation is used to indicate that a parameter, field, or method return value must not be empty. An empty string, collection, or array will cause an exception to be thrown at runtime. @NotEmpty is also part of the Bean Validation framework.

@NotBlank: This annotation is used to indicate that a parameter, field, or method return value must not be null or consist entirely of whitespace. This is commonly used for validating user input in web applications, where leading or trailing spaces in a user's input could cause issues. @NotBlank is also part of the Bean Validation framework.

It's worth noting that @NotEmpty and @NotBlank are not included in the standard Java library and must be imported separately. Additionally, @NotBlank is only applicable to strings, while @NotEmpty can be used for strings, collections, and arrays.
[10:24 AM]
from ChatGPT, looked it up after Lia explained a little more!