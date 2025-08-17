build: clean
	@javac *.java -d build

run:
	@java -cp build Main

clean:
	@rm -rf build