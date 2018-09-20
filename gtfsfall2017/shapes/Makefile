JAVASRC = Shapes.java
CLASSES = Shapes.class
EXEC = Shapes
INPUT3 = listoffiles.txt
OUTPUT = shapes.txt

${CLASSES}: ${JAVASRC}
	javac ${JAVASRC}
	java ${EXEC} ${OUTPUT}

clean:
	rm ${$EXEC}${CLASSES}

.PHONY: clean
