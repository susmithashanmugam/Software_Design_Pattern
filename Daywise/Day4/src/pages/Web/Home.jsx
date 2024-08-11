import React from 'react'

import {
  Carousel,
  CarouselContent,
  CarouselItem,
  CarouselNext,
  CarouselPrevious,
} from "@/components/ui/carousel"

const Home = () => {
  return (
    <div className='h-full w-full flex justify-center items-center'>
    <Carousel>
  <CarouselContent>
    
    <CarouselItem>...</CarouselItem>
    <CarouselItem><img src='https://www.bigbasket.com/media/uploads/banner_images/hp_m_petstore_250923_400.jpg?tr=w-1920,q=80' alt='slide2'></img></CarouselItem>
    <CarouselItem>...</CarouselItem>
  </CarouselContent>
  <CarouselPrevious />
  <CarouselNext />
</Carousel>

</div>
  )
}

export default Home