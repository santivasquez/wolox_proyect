# wolox_proyect

Interview process

Basis of the exercise:

The goal is to develop an API to consume an external service and use
your information, you also have to expand the scope of the development by adding a
more functionality that allows new information to persist in the system,
related to the external API data.
The only mandatory requirement is to use Java with Spring Boot as the technology of
development and development using Github or Gitlab as a repository.
Business problem
The information must be consumed from the next external service that counts
with the data of users, their albums, and their photos; in addition to their posts and
comments from other users about them: https://jsonplaceholder.typicode.com/
The information of the service must be accessible through our API to:

1. Users.
2. The photos.
3. The albums of the system and each user.
4. Plus: The photos of a user.
   In this way, the API will be able to concentrate this information and then be able to
   extend it to new functionality, which consists of implementing a management
   basic permission to each photo album (read and write) to share
   albums among platform users. In this way, it should be recorded what
   Users have access to albums that are not their own and the permissions of a said user for that album. To persist and consume this new information the system
   must allow:
5. Register an album shared with a user and their permissions.
6. Change a user's permissions for a specific album.
7. Bring in all users who have specific permission regarding a
   specific album.
   As for the comments, it is expected that the application can bring them from the
   external service offering the possibility of filtering by the "name" field or by the user who made said comment
