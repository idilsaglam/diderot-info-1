FROM debian:latest

RUN apt-get update -y
RUN apt-get install man -y
RUN apt-get install emacs -y

WORKDIR /root
SHELL ["/bin/bash", "-c"]

