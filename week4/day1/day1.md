Agenda:Week4.day1

02:30 to 03:40 : Alert
03:40 to 04:05 : Breakout(15 mins)+Break(5 mins) 
04:05 to 04:45 : Frame 
04:45 to 05:10 : Breakout(15 mins)+Break(10 mins) 
05:10 to 05:45 : Set 
05:45 to 05:50 : Break 
05:50 to 06:30 : Window Handling

Target Locator:

Alert: It represents an alert dialog box.
Frame: It represents an inline frame within a page.
Window: It represents a top-level browsing context, typically a tab or a window.
The methods provided by the target locator interface allow you to switch between these contexts:

switchTo().window(String windowHandle): Switches focus to the specified window.
switchTo().frame(int index): Switches focus to the frame at the specified index.
switchTo().frame(String nameOrId): Switches focus to the frame with the specified name or ID.
switchTo().frame(WebElement frameElement): Switches focus to the specified frame element.
switchTo().defaultContent(): Switches focus back to the default content (i.e., main window or top-level frame).
switchTo().parentFrame(): Switches focus to the parent frame of the current frame.
swtichTo().alert(): Swtiches focus to alert box Using these methods, you can interact with elements inside different frames, handle multiple windows, and manage alerts effectively during test automation.
https://www.myamcat.com/personal-information?source=myamcatNavigationBarNew

Alert:

Javascript -based types of alert:
Modal alert: (we cannot inspected alert) 1.simple alert - message with one button(ok or yes) 2.comfirmatiom alert -message with 2 buttons(ok/cancle or yes/no) 3.prompt alert - one input field with 2 buttons(ok/cancle or yes/no)

syntax:

driver.switchTo().alert();

Alert Interface Actions:

accept()-clicks on Ok button

dismiss()- clicks on Cancel button

getText() -Retrives the text from alert box

sendKeys() - give input in alert box

Non-Modal alert: (we can able inspected alert) Sweet alert

https://dev206470.service-now.com/login username= password=CW%24t4R*Lzvy6

Frame:

What is a Frame? A frame is a part of a web page or browser window which displays content independent of its container, with its own scroll and navigation. It's essentially a document within a document, commonly used to embed a separate document within a web page.

Why Handle Frames? Frames must be handled because Selenium WebDriver operates on a single document context. If a web page contains frames, WebDriver cannot automatically access the content of these frames. To interact with elements within a frame, WebDriver must switch to it explicitly.

How to Identify a Frame? Frames can be identified by right-clicking on the element and selecting "View Frame Source" for direct URLs or by searching for the frame or iframe tags within the HTML DOM.

Structure of Frame When you inspect a web page, you'll notice that the frame or iframe tags define the frame structure. Each frame will have its own HTML document, which can be navigated and manipulated independently of the main page.

How to Handle Frames? To handle frames, use the switchTo() method provided by WebDriver.

By index: driver.switchTo().frame(int index) By Name or ID: driver.switchTo().frame(String nameOrId) By Reference: driver.switchTo().frame(WebElement frameElement)

Once you're done with the frame and need to switch back to the main content, use: driver.switchTo().defaultContent()

And to switch to the immediate parent frame, use: driver.switchTo().parentFrame()

How to Handle Nested Frames Nested frames are handled by switching into each frame sequentially. After interacting with the deepest frame, you need to switch back to the parent frame or main document to continue the automation tasks. For handling nested frames, you would use a sequence of switchTo().frame() calls to drill down into the nested structure, and use switchTo().parentFrame() or switchTo().defaultContent() to navigate back up. Exception: NoSuchFrameException in Selenium is thrown when the WebDriver attempts to switch to a non-existent frame. - This can happen if the frame has been removed or if it never existed in the DOM at the point of the attempt. - It indicates that the specified frame is not present in the current page context, and the automation script needs to ensure that the frame name, ID, or reference being used to switch to is correct and available. This exception is a signal to check the frame's existence, its correct identification, or if the page has fully loaded before attempting to switch frames.

List: {2,5,4,6,2,7,8,1,6} - input {2,5,4,6,2,7,8,1,6} - ouput get(4)=>2 index value get()

SET: input :{2,5,4,6,2,7,8,1,6} -hashset,linkedhashset, treeset

output : {2,5,4,6,7,8,1} get(4)=>7

index value change so we cannot use get()

Collection: Set Definition: The Set interface in Java is a part of the Java Collections Framework. It represents a collection that cannot contain duplicate elements. Properties of Set: No Duplicate Elements: Ensures that each element in the Set is unique. Unordered Collection: Except for some specific implementations like LinkedHashSet or TreeSet, the Set does not guarantee the order of its elements. Implementation Classes: HashSet: Maintains a random order LinkedHashSet: Maintains insertion order of elements. TreeSet: Ascii value Maintains sorted order

collections.sort()=> sameFunction in SET we can get from TreeSET Why There is No get() in Set: The Set interface does not have a get() method, and this is by design, due to the following reasons:

Uniqueness Over Indexing: The Set is designed to ensure uniqueness rather than maintain an index-based system like List. Elements in a Set are not accessed by an index. Undefined Ordering: In most implementations of Set, the order of elements is not fixed. Therefore, retrieving an element by a specific index or position does not make sense.



List :

int / 23,45,23,67,54,12,67,43,22

out/ 23,45,23,67,54,12,67,43,22
get(5); => 12

Set:
out/ 23,45,67,54,12,43,22



