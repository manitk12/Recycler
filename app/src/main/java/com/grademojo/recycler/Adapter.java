package com.grademojo.recycler;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    private List<Getter_Getter> values;




    public class ViewHolder extends RecyclerView.ViewHolder{

        

        public TextView text_Roll_no , text_Class,text_Name ,text_Gender ,text_Section ,text_Male ,text_Female;

        public ImageView image_Gender;

        public View layout;



        public ViewHolder(View itemView) {

            super(itemView);

            layout = itemView;
            text_Roll_no = (TextView) itemView.findViewById(R.id.roll_no_text);
            text_Class = (TextView) itemView.findViewById(R.id.class_text);
            text_Name = (TextView) itemView.findViewById(R.id.name_text);
            text_Section = (TextView) itemView.findViewById(R.id.section_text);
            text_Gender = (TextView) itemView.findViewById(R.id.gender);
            text_Male = (TextView) itemView.findViewById(R.id.male_text);
            text_Female = (TextView) itemView.findViewById(R.id.female_text);

            image_Gender = (ImageView) itemView.findViewById(R.id.image_gender_icon);



            text_Male.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image_Gender.setImageResource(R.drawable.avatar_student);
                    text_Male.setTextColor(ContextCompat.getColor(v.getContext(),R.color.red));
                    text_Female.setTextColor(ContextCompat.getColor(v.getContext(),R.color.black));

                    values.get( getAdapterPosition() ).setClick_option(
                            Getter_Getter.MALE_CLICKED
                    );



                }
            });






            text_Female.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    image_Gender.setImageResource(R.drawable.teacher);
                    text_Female.setTextColor(ContextCompat.getColor(v.getContext(),R.color.green));
                    text_Male.setTextColor(ContextCompat.getColor(v.getContext(),R.color.black));

                    values.get( getAdapterPosition() ).setClick_option(
                            Getter_Getter.FEMALE_CLICKED
                    );


                }
            });



//            text_Present.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    remove(getAdapterPosition());
//                }
//            });
        }
    }




    public Adapter(List<Getter_Getter> mydataset){

        values = mydataset;
    }


    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.relative_background,parent,false);

        Adapter.ViewHolder viewHolder = new Adapter.ViewHolder(view);

        return viewHolder;
    }


    public void onBindViewHolder(ViewHolder holder, final int position) {


        Getter_Getter item = values.get(position);
        Context context = holder.layout.getContext();


        switch (item.getClick_option()){
            case Getter_Getter.MALE_CLICKED:


                holder.image_Gender.setImageResource(R.drawable.avatar_student);
                holder.text_Male.setTextColor(ContextCompat.getColor(context,R.color.red));
                holder.text_Female.setTextColor(ContextCompat.getColor(context,R.color.black));

                break;


            default:

                holder.text_Female.setTextColor(ContextCompat.getColor(context,R.color.red));
                holder.text_Male.setTextColor(ContextCompat.getColor(context,R.color.black));
                holder.image_Gender.setImageResource(R.drawable.teacher);



        }




        // Information current=data.get(position);
        //   holder.title.setText(current.title);

        // holder.title.setText(current.title);


        //Integer.parseInt(view.getTag().toString())



        holder.text_Roll_no.setText("" + item.getRoll_no());

        holder.text_Name.setText("" + item.getName());

        holder.text_Class.setText("" + item.getClass2());

        holder.text_Gender.setText("" + item.getGender());

        holder.text_Section.setText("" + item.getSection());



    }


    public int getItemCount() {

        return values.size();
    }





//    public void remove(int position){
//
//        values.remove(position);
//        notifyItemRemoved(position);
//
//    }
}

