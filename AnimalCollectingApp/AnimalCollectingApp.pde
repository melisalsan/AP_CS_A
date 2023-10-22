PImage maymun; //<>// //<>//
float a, b;
int score = 0;

String[] imageURLs = {
  "https://img.freepik.com/photos-premium/chimpanzee-in-white-background_991097-12.jpg",
  "https://images.rawpixel.com/image_800/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTA3L3JvYl9yYXdwaXhlbF9waG90b2dyYXBoX29mX2FfYmFieV9vcmFndXRhbl9pc29sYXRlZF9vbl93aGl0ZV9zdF84ZTE2OTRmZi1lOWU2LTQ0MTEtYWQzNC00NTdjOGE4NjBhNzYtNXgtaHEtc2NhbGUtNV8wMHguanBn.jpg",
  "https://t4.ftcdn.net/jpg/02/57/86/55/360_F_257865587_FKy2Wfeh9XY42UcsrfluO0Q0TSErfAQl.jpg",
  "https://t4.ftcdn.net/jpg/04/14/63/91/360_F_414639129_algvEpIN4cbnmXIFCtexEt3BepIAs4ZI.jpg",
  "https://i.pinimg.com/236x/db/fc/b1/dbfcb1611ca1a06b99bc30dfef0f1737.jpg",
  "https://i.pinimg.com/736x/5e/3b/b7/5e3bb7e152bd4dffc01839f889040a14.jpg",
};

void setup() {
  size(750, 750);
  a = random(0, 600);
  b = random(0, 600);
  background(255);
  changeImage();
}

void draw() {
  // Display the score
  textSize(24);
  fill(0);
  text("Current Score: " + score, 50, 50);
}

void mousePressed() {
  if (mouseX > (a - 100) && mouseX < (a + 100) && mouseY > (b - 100) && mouseY < (b + 100)) {
    score++;
    a = random(0, 600);
    b = random(0, 600);
    background(255);
    changeImage();
  }
}

void changeImage() {
  int img = int(random(0, imageURLs.length));
  maymun = loadImage(imageURLs[img], "png");
  image(maymun, a, b, 150, 150);
}
