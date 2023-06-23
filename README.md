# spring-web-example

## Important Spring Annotations:

@SpringBootApplication

@GetMapping
@PostMapping
@PutMapping
@DeleteMapping
Annotate Java methods
Specify the "path" part of the URL to which the method responds

{name}
==
@RequestMapping  (all of the above)
Can also annotate a controller class to set a base path for the URL


@RestController

Annotates a class
Marks a class that provides RESTful web content

@PathParameter

Annotates a method parameter
maps a portion of the path {name} to a variable
