SHELL := /bin/bash

deploy:
	source .env && lein deploy private
