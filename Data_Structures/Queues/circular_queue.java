package Data_Structures.Queues;

public class circular_queue {

    int front=-1;
    int rear=-1;
    int n=10;
    int[] arr=new int[n];


    public void enqueue(int data)
    {
        if((rear)!=front) {
            if (front == -1 && rear == -1) {
                arr[++front] = data;
                rear++;
            }
            else{
                arr[++rear]=data;
            }
        }
        else {
            System.out.println("Queue is Full !!!");
        }

    }

    public void dequeue()
    {
        if(front>-1)
        {
            if(front==0 && rear==0)
            {
                arr[front]=0;
                front--;
                rear--;
            }
            else if(front ==0) {
                for (int i = 1; i < rear; i++) {
                    arr[i - 1] = arr[i];
                }
                arr[rear] = 0;
                rear--;
            }
        }
        else{
            System.out.println("The Queue is Empty");
        }
    }



    public void dispaly()
    {
        for(int i=front ;i<=rear;i++)
        {
            System.out.print(arr[i]+" -> ");
        }
        System.out.println(" ");
    }
}
