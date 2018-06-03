package net.marco27.groovy

class HelloWorld {

	static void main(String[] args) {
		def name
		if (args.length > 0) {
			name = args[0]
		} else {
			name = "World!"
		}
		println "Hello " + name + "!"
	}
}
