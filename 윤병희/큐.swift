let N = Int(readLine()!)!

var leftStack = [Int]()
var rightQueue = [Int]()
var count = 0

func switchQueueToStack() {
    leftStack = rightQueue.reversed()
    rightQueue = [Int]()
}

for _ in 1...N {

    let input = readLine()!.split(separator: " ")

    if input[0] == "push" {
        rightQueue.append(Int(input[1])!)
        count += 1
    } else if input[0] == "pop" {
        
        if !leftStack.isEmpty {
            print(leftStack.removeLast())
            count -= 1
        } else if !rightQueue.isEmpty {
            switchQueueToStack()
            print(leftStack.removeLast())
            count -= 1
        } else {
            print(-1)
        }
        
    } else if input[0] == "size" {
        print(count)
    } else if input[0] == "empty" {
        print(count == 0 ? 1 : 0)
    } else if input[0] == "front" {
        
        if count == 0 {
            print(-1)
        } else if !leftStack.isEmpty {
            print(leftStack.last!)
        } else if !rightQueue.isEmpty {
            print(rightQueue.first!)
        }
        
    } else if input[0] == "back" {
        
        if count == 0 {
            print(-1)
        } else if !rightQueue.isEmpty {
            print(rightQueue.last!)
        } else if !leftStack.isEmpty {
            print(leftStack.first!)
        }
    }
}
