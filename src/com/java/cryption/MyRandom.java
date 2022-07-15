package com.java.cryption;

public class MyRandom {
    int[] IntArray;

    public MyRandom(int[] IntArray){
        this.IntArray = IntArray;
    }

    //?  배열을 뒤집어줌 return 뒤집어진 배열
    public int[] ReverseArray(){
        int[] reverse = new int[IntArray.length];

        for(int i=0; i < IntArray.length; i++){
            //? 기존배열(IntArray) 의 마지막에서 부터 reverse의 첫번째로 저장함
            reverse[i] = IntArray[IntArray.length-(i+1)];
        }

        return reverse;
    }

    //? 배열을 섞어줌
    public int[] ShuffleArray(){
        int[] shuffle = new int[IntArray.length];
        int temp;
        int[] RandHistory ={0};
        arrraylist a = new arrraylist(RandHistory);

        for(int i =0; i < IntArray.length; i++){
            int RandInt = (int)(Math.random()*IntArray.length);

            //? RandHIstory 안에 RandInt와 같은 수가 나오지 않았다면 실행 
            if(TurnArray(RandHistory, RandInt) == false){
                //? RandHistory에 새로운 RandInt추가
                RandHistory = a.Add(RandInt);

                temp = IntArray[i];
                IntArray[i] = IntArray[RandInt];
                IntArray[RandInt] = temp;
            }
        }
        shuffle = IntArray;
        return shuffle;
    }

    //? 배열을 돌고 원하는 수를 찾음
    public boolean TurnArray(int[] array,int num){

        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                return true;
            }
            else{
                continue;
            }
        }
        return false;
    }
}
