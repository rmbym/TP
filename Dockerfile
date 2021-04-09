FROM openjdk:latest
WORKDIR /poke_tour
COPY /poke_tour/src .
RUN javac -encoding utf-8 -d bin src/*.java && jar cvf poke_tour.jar bin/poke_tour/*.class
CMD java poke_tour.jar