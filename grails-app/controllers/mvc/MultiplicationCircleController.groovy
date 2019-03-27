package mvc

class MultiplicationCircleController {
    static int radius = 200
    static int cx = radius
    static int cy = radius

    def index(MultiplicationCircleModel circleModel) {
        circleModel.lines = []
        for(int i = 0; i< circleModel.segmentCount; i++) {
            circleModel.lines.add( new Line (
                x1: xValueOf(i, circleModel.segmentCount),
                y1: yValueOf(i, circleModel.segmentCount),
                x2: xValueOf(i * circleModel.tableBase, circleModel.segmentCount), // todo: change according to the tableBase
                y2: yValueOf(i * circleModel.tableBase, circleModel.segmentCount)  // todo: change according to the tableBase
            ))
        }
        render view:"show", model:[circleInstance: circleModel]
    }

    private static double arc(int segment, int segmentCount) {
        2 * Math.PI * segment / segmentCount
    }
    def xValueOf(int segment, int segmentCount) {
        return cx + Math.cos(arc(segment, segmentCount)) * radius
    }
    def yValueOf(int segment, int segmentCount) {
        return cy + Math.sin(arc(segment, segmentCount)) * radius
    }
}

class MultiplicationCircleModel {
    int segmentCount = 10
    int tableBase = 2

    List<Line> lines = Collections.EMPTY_LIST
}

class Line {
    double x1, y1, x2, y2
}