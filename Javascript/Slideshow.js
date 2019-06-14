var slideshow = {
  photoList: ['P1', 'P2', 'P3', 'P4'],
  currentPhotoIndex: -1,
  nextPhoto() {
    if (this.currentPhotoIndex < this.photoList.length - 1) {

      this.currentPhotoIndex++;
      console.log(this.photoList[this.currentPhotoIndex]);
    } else {
 
      console.log('End of Slideshow')
     this.pause();
    
    }
  }

  ,
  previousPhoto() {
    if (this.currentPhotoIndex == -1) {
      this.currentPhotoIndex--;
      console.log(this.photoList[this.currentPhotoIndex]);
    } else {
      
      console.log('beginning of Slideshow')
    }
  }
  ,
  getCurrentPhoto() {
    return this.photoList[this.currentPhotoIndex];
  }
  ,
  playInterval: null,
  play: function(){
    this.playInterval = setInterval(this.nextPhoto.bind(this),2000)
  }
  ,
  pause: function(){
    clearInterval(this.playInterval)
  }
} 
slideshow.play();
