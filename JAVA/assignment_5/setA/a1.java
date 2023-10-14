public void actionPerformed(ActionEvent ae)
          {
                 JButton pb=(JButton)ae.getSource();
                 if(pb==b15)
                 {
                       r=n1=n2=0;
                       res.setText("");
                 }
                 else
                 
                      if(pb==b14)
                      {
                             n2=Integer.parseInt(res.getText());
                             eval();
                             res.setText(""+r);
                      }
                      else
                      {
                              boolean opf=false;
                              if(pb==b10)
                              {
                                     op='+';
                                     opf=true;
                              }
                              if(pb==b11)
                               {
                                     op='-';
                                     opf=true;
                              }                                           
                              if(pb==b12)
                              {
                                     op='*';
                                     opf=true;
                              }
                              if(pb==b13)
                              {
                                     op='/';
                                     opf=true;
                              }
                              if(opf==false)
                              {
                                    for (int i=0;i<10;i++)
                                    {
                                          if (pb==b[i])
                                          {  
                                                String t=res.getText();
                                                t+=i;
                                                res.setText(t);
                                           }
                                    }
                               }
                               else
                               {
                                     n1=Integer.parseInt(res.getText());
                                     res.setText("");
                               }
                               
                        }
                   
                 }
                 int eval()
                 {
                        switch(op)
                        {
                                case'+':{ 
                                              r=n1+n2;
                                              break;
                                        }
                                case'-':{ 
                                              r=n1-n2;
                                              break;
                                        }  
                                case'*':{ 
                                              r=n1*n2;
                                              break;
                                        } 
                               case'/':{ 
                                              r=n1/n2;
                                              break;
                                        }  
                         }
                         return 0;
                 }
                 public static void main (String args[])
                 {
                       new Calculator();
                 }
           }