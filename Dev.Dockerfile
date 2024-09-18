FROM amazoncorretto:17 AS builder

ARG ARTEFACT_VERSION
ENV ARTIFACT_VERSION=${ARTEFACT_VERSION}

RUN echo ${ARTIFACT_VERSION}

WORKDIR /app

COPY build/libs/spring-e2e-service-${ARTIFACT_VERSION}.jar /app/spring-e2e-service.jar

EXPOSE 8090

CMD ["java", "-jar", "/app/cb-bin-service.jar"]