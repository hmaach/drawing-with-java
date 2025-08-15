build: clean
	@javac Main.java packages/image/*.java packages/shapes/*.java -d build

run:
	@java -cp build Main

clean:
	@rm -rf build