shell=powershell

all: clean analyzer

#Compile
.ONESHELL:
analyzer:
	@echo "Compiling..."
	cd ./business
	javac -d ./build/ ./src/*.java

#Run server
.ONESHELL:
runServer:
	cd ./server/bin
	${shell} ./gateway.start.bat --broker jms


#Run listener
runList:
	@echo "Running listener..."
	${shell} cd ./business/build ;\
	java src.Listener

clean:
	@echo "Cleaning previously generated files..."
	${shell} if (Test-Path business/build) {rm -r business/build/*}