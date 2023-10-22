size(500,500);
background(0,0,0);

// ilk 2 random sayi ilk dikdortgen width height
float a = random(0, 500);
float b = random(0,500);

// 2. dikdortgen randomu

float c = random(0, 500-a);

// row 2 icin random
float d = random(0,500);

// row 1
// --> 

// rectangle 1
// renkleri icin olan randomlar: 

float r1r = random(0,255);
float r1g = random(0,255);
float r1b = random(0,255);

fill(r1r,r1g,r1b);
rect(0,0, a,b);
//rgb colors -->  max is 255
// the random range for height and width is from 0 to 500

//rectangle 2

float r2r = random(0,255);
float r2g = random(0,255);
float r2b = random(0,255);


fill(r2r,r2g,r2b);
rect(a, 0, c, b);
// ilk 2 sayi initial position
// 3. sayi width
// 4. sayi height

// rectangle 3

float r3r = random(0,255);
float r3g = random(0,255);
float r3b = random(0,255);

fill(r3r,r3g,r3b);
rect(a + c, 0, (500- (a+c)), b);


// row2 
// rect 2.1

float r21r = random(0,255);
float r21g = random(0,255);
float r21b = random(0,255);

fill(r21r,r21g,r21b);
rect(0, b, d, (500-b));

// rect 2.2

float r22r = random(0,255);
float r22g = random(0,255);
float r22b = random(0,255);

fill(r22r,r22g,r22b);
rect(d, b, (500-d), (500-b));
